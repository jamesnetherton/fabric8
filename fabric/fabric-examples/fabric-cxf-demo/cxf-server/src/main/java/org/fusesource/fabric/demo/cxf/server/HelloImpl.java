/**
 * Copyright (C) FuseSource, Inc.
 * http://fusesource.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.fusesource.fabric.demo.cxf.server;

import org.fusesource.fabric.demo.cxf.Hello;

public class HelloImpl implements Hello {
    private String hello = "hello";
    
    public void setHello(String hi) {
        this.hello = hi;
    }

    public String sayHello() {
        return hello;
    }

    public void ping() {
        System.out.println("Call ping method");
    }
}
