package org.eurekaclinical.registry.client.comm;

/*-
 * #%L
 * Eureka! Clinical Registry Client
 * %%
 * Copyright (C) 2017 - 2018 Emory University
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */



import java.util.List;
import org.eurekaclinical.common.comm.Group;

/**
*
* @author Dileep Gunda
*/
public class RegistryGroup extends Group {

    private List<Long> users;
    private List<Long> components;

    public List<Long> getUsers() {
        return users;
    }

    public void setUsers(List<Long> users) {
        this.users = users;
    }

    public List<Long> getComponents() {
        return components;
    }

    public void setComponents(List<Long> components) {
        this.components = components;
    }
}
