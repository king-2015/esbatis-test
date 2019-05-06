package com.xiaoya.infra.esbatis.parser;

import com.xiaoya.infra.esbatis.mapper.MapperFactory;
import com.xiaoya.infra.esbatis.utils.XmlNodeUtils;
import org.w3c.dom.Node;

import java.io.InputStream;
import java.util.List;

/**
 * @Description:
 * @Author: zhuzhongji
 * @Date: 2019/5/6 15:56
 */
public class XmlMapperParser {

    private MapperFactory mapperFactory;
    private XPathParser parser;
    private String namespace;

    public XmlMapperParser(InputStream inputStream, MapperFactory configuration) {
        this(configuration, new XPathParser(inputStream));
    }

    public XmlMapperParser(MapperFactory mapperFactory, XPathParser parser) {
        this.mapperFactory = mapperFactory;
        this.parser = parser;
    }

    public void parse() {
        parseMapperElement(parser.evalNode("/mapper"));
    }

    private void parseMapperElement(Node mapperNode) {
        try {
            String namespace = XmlNodeUtils.getStringAttribute(mapperNode, "namespace");
            if (namespace == null || namespace.equals("")) {
                throw new ParserException("Mapper's namespace cannot be empty");
            }
            this.namespace = namespace;
            buildStatementFromContext(parser.evalNodes(mapperNode,
                    "index|update|delete|get|search|delete_by_query|update_by_query|mget|bulk"));
        } catch (Exception e) {
            throw new ParserException("Error parsing Mapper XML. Cause: " + e, e);
        }
    }

    private void buildStatementFromContext(List<Node> list) {
        for (Node context : list) {
            XmlStatementParser statementParser = new XmlStatementParser(mapperFactory, namespace, context);
            statementParser.parseStatementNode();
        }
    }

}
