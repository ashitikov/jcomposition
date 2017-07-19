/*
 * Copyright 2017 TrollSoftware (a.shitikov73@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jcomposition.example.partial;

import jcomposition.api.annotations.Bind;
import jcomposition.api.annotations.Composition;
import jcomposition.example.interfaces.IMovable;

@Bind(Full.class)
@Composition(name = "FullBase", j2objc = false)
public interface IFull extends IMovable, IPartial {
    void partialTest();
}
