/**
 * Copyright (C) 2013-2015 Vasilis Vryniotis <bbriniotis@datumbox.com>
 *
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
 */
package com.datumbox.common.persistentstorage.interfaces;

import java.util.Properties;

/**
 * This interface should be implemented by objects that store the configuration 
 * of DB connectors.
 * 
 * @author Vasilis Vryniotis <bbriniotis@datumbox.com>
 */
public interface DatabaseConfiguration {
    
    /**
     * Returns the separator that is used in the DB names. Usually the database
     * names used by the algorithms are concatenations of various words separated
     * by this character.
     * 
     * @return 
     */
    public String getDBnameSeparator();
    
    /**
     * Initializes and returns a connection to the Database.
     * 
     * @param database
     * @return 
     */
    public DatabaseConnector getConnector(String database);
    
    /**
     * Initializes the DatabaseConfiguration object by using a property file.
     * 
     * @param properties 
     */
    public void load(Properties properties);
}
