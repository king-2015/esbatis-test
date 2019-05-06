package com.xiaoya.infra.esbatis.parser.nodes;

import com.xiaoya.infra.esbatis.parser.DynamicContext;
import com.xiaoya.infra.esbatis.parser.PlaceholderParser;

/**
 * @author jinzhong.zhang
 */
public class TextNode implements XmlNode {
    private final String text;

    public TextNode(String text) {
        this.text = text;
    }

    @Override
    public boolean apply(DynamicContext context) {
        PlaceholderParser parser = new PlaceholderParser();
        context.appendString(parser.parse(text, context.getBindings()));
        return true;
    }

}