package com.deloitte.sample.integration.demo.publisher.route;

import com.deloitte.sample.integration.demo.publisher.gateway.SecurityEODPublishInboundGateway;
import com.deloitte.sample.integration.demo.publisher.gateway.SecurityEODPublishOutboundGateway;
import com.deloitte.sample.integration.demo.publisher.transformation.aggregator.SecurityEODAggregator;
import com.deloitte.sample.integration.demo.publisher.transformation.transformer.SecurityEODTransformer;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.builder.xml.Namespaces;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.spi.DataFormat;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;

@Component
public class SecurityEODRoute extends RouteBuilder {
  private static final String DEFAULT_NAMESPACE_PREFIX = "ns1";
  private static final String DEFAULT_NAMESPACE_URI = "urn:foo";
  private static final char DEFAULT_MODE = 'w';

  DataFormat formatter =
      new JaxbDataFormat(
          "com.deloitte.sample.integration.demo.publisher.transformation.securitycanon");

  @Override
  public void configure() throws Exception {

    from(SecurityEODPublishInboundGateway.SECURITY_PUBLISH_EOD_ROUTE_URI)
        .to("log:?level=INFO&showBody=true")
        .split()
        .xtokenize(
            "/ASSETS/ASSET",
            DEFAULT_MODE,
            new Namespaces(DEFAULT_NAMESPACE_PREFIX, DEFAULT_NAMESPACE_URI))
        .aggregationStrategy(new SecurityEODAggregator())
        .streaming()
        .convertBodyTo(Document.class)
        .bean(new SecurityEODTransformer(), "transform")
        .end()
       // .bean(new SecurityEODCanonTransformer())
        .to("direct:publish-eod-security");

    from("direct:publish-eod-security")
        .to("log:?level=INFO&showBody=true")
        .marshal(formatter)
        .to(SecurityEODPublishOutboundGateway.EOD_PUBLISH_SECURITY_ROUTE_OUTBOUND_GATEWAY_URI);


          }
}
