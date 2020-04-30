package io.joyrpc.protocol.dubbo;

/*-
 * #%L
 * joyrpc
 * %%
 * Copyright (C) 2019 joyrpc.io
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import io.joyrpc.protocol.AbstractProtocol;
import io.joyrpc.protocol.dubbo.codec.DubboCodec;
import io.joyrpc.transport.codec.Codec;

/**
 * Dubbo协议
 */
public abstract class DubboAbstractProtocol extends AbstractProtocol {

    /**
     * Dubbo的MagicCode
     */
    protected static final byte[] MAGIC_CODE = new byte[]{(byte) 0xDA, (byte) 0xBB};

    @Override
    protected Codec createCodec() {
        return new DubboCodec(this);
    }

    @Override
    public byte[] getMagicCode() {
        return MAGIC_CODE;
    }
}
