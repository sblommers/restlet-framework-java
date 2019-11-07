/**
 * Copyright 2005-2019 Talend
 * 
 * The contents of this file are subject to the terms of one of the following
 * open source licenses: Apache 2.0 or or EPL 1.0 (the "Licenses"). You can
 * select the license that you prefer but you may not use this file except in
 * compliance with one of these Licenses.
 * 
 * You can obtain a copy of the Apache 2.0 license at
 * http://www.opensource.org/licenses/apache-2.0
 * 
 * You can obtain a copy of the EPL 1.0 license at
 * http://www.opensource.org/licenses/eclipse-1.0
 * 
 * See the Licenses for the specific language governing permissions and
 * limitations under the Licenses.
 * 
 * Alternatively, you can obtain a royalty free commercial license with less
 * limitations, transferable or non-transferable, directly at
 * https://restlet.com/open-source/
 * 
 * Restlet is a registered trademark of Restlet S.A.S.
 */

package org.restlet.ext.platform.internal.firewall.rule.counter;

import java.util.concurrent.atomic.AtomicInteger;

import org.restlet.ext.platform.internal.firewall.rule.CounterResult;

/**
 * {@link Counter} which counts concurrent requests.
 * 
 * @author Guillaume Blondeau
 */
public class ConcurrentCounter extends Counter {

    /** The counter value. */
    protected final AtomicInteger counter;

    public ConcurrentCounter() {
        this.counter = new AtomicInteger();
    }

    @Override
    public void decrement() {
        counter.decrementAndGet();
    }

    @Override
    public CounterResult increment() {
        int count = counter.incrementAndGet();
        CounterResult counterResult = new CounterResult();
        counterResult.setConsumed(count);
        return counterResult;
    }

}