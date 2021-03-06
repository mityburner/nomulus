// Copyright 2017 The Nomulus Authors. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package google.registry.util;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/** A simple clock that always returns a fixed time. */
public class FixedClock implements Clock {
  private final DateTime nowUtc;

  public FixedClock(long millisSinceEpoch) {
    this.nowUtc = new DateTime(millisSinceEpoch, DateTimeZone.UTC);
  }

  @Override
  public DateTime nowUtc() {
    return nowUtc;
  }
}
