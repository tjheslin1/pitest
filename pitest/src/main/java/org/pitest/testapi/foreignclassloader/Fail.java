/*
 * Copyright 2010 Henry Coles
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */

package org.pitest.testapi.foreignclassloader;

import org.pitest.functional.SideEffect2;
import org.pitest.testapi.Description;
import org.pitest.testapi.ResultCollector;

public class Fail implements SideEffect2<ResultCollector, Description> {

  private final Throwable throwable;

  public Fail(final Throwable throwable) {
    this.throwable = throwable;
  }

  @Override
  public void apply(final ResultCollector rc, final Description description) {
    rc.notifyEnd(description, this.throwable);
  }

}
