package com.github.afkbrb.nioserver.http;

import com.github.afkbrb.nioserver.IMessageReader;
import com.github.afkbrb.nioserver.IMessageReaderFactory;
import com.github.afkbrb.nioserver.MessageBuffer;

/**
 * Created by jjenkov on 18-10-2015.
 */
public class HttpMessageReaderFactory implements IMessageReaderFactory {

    public HttpMessageReaderFactory() {
    }

    @Override
    public IMessageReader createMessageReader() {
        return new HttpMessageReader();
    }
}
