package com.xiaoya.infra.esbatis.parser.nodes;

import com.xiaoya.infra.esbatis.parser.DynamicContext;

/**
 * @author jinzhong.zhang
 */
public interface XmlNode {

    boolean apply(DynamicContext context);
}
