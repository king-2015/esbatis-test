package com.xiaoya.infra.esbatis.parser;

import com.xiaoya.infra.esbatis.mapper.MappedStatement;
import com.xiaoya.infra.esbatis.mapper.MapperFactory;
import com.xiaoya.infra.esbatis.parser.nodes.XmlNode;
import com.xiaoya.infra.esbatis.utils.XmlNodeUtils;
import org.w3c.dom.Node;

/**
 * @Description:
 * @Author: zhuzhongji
 * @Date: 2019/5/6 15:57
 */
public class XmlStatementParser {

    private MapperFactory mapperFactory;
    private final Node statementNode;
    private final String namespace;

    public XmlStatementParser(MapperFactory mapperFactory, String namespace, Node statementNode) {
        this.mapperFactory = mapperFactory;
        this.statementNode = statementNode;
        this.namespace = namespace;
    }

    public void parseStatementNode() {
        String commandType = XmlNodeUtils.getName(statementNode);
        String id = XmlNodeUtils.getStringAttribute(statementNode, "id");
        String url = XmlNodeUtils.getStringAttribute(statementNode, "url");
        String method = XmlNodeUtils.getStringAttribute(statementNode, "method");

        XmlNodeParser builder = new XmlNodeParser(statementNode);
        XmlNode bodyNode = builder.parseBodyNode();

        MappedStatement ms = new MappedStatement(commandType, globalId(id), url, method, bodyNode);
        mapperFactory.addMappedStatement(ms);
    }

    private String globalId(String id) {
        // is it qualified with this namespace yet?
        if (id.startsWith(namespace + ".")) {
            return id;
        }
        if (id.contains(".")) {
            throw new ParserException("Dots are not allowed in element names, please remove it from " + id);
        }
        return namespace + "." + id;
    }
}
