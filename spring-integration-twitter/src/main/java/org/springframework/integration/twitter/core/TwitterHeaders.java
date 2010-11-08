/*
 * Copyright 2002-2010 the original author or authors
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */

package org.springframework.integration.twitter.core;

/**
 * Header keys used by the various Twitter adapters.
 *
 * @author Josh Long
 * @since 2.0
 */
public abstract class TwitterHeaders {

	private static final String PREFIX = "twitter_";

	public static final String IN_REPLY_TO_STATUS_ID = PREFIX + "inReplyToStatusId";

	public static final String PLACE_ID = PREFIX + "placeId";

	public static final String GEOLOCATION = PREFIX + "geolocation";

	public static final String DISPLAY_COORDINATES = PREFIX + "displayCoordinates";

	public static final String DM_TARGET_USER_ID = PREFIX + "dmTargetUserId";

}