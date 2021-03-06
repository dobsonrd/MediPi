/*
 Copyright 2016  Richard Robinson @ HSCIC <rrobinson@hscic.gov.uk, rrobinson@nhs.net>

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package org.medipi.downloadable.handlers;
import org.medipi.model.DownloadableDO;

/**
 * An interface to allow handling of different types of downloadable from the concentrator
 * @author rick@robinsonhq.com
 */
public interface DownloadableHandler {

    /**
     * Method to call handle on the downloadable object handler
     * @param d DownloadableDO data object
     */
    public void handle(DownloadableDO d);
}
