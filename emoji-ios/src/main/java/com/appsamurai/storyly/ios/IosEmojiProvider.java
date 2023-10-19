/*
 * Copyright (C) 2016 - Niklas Baudy, Ruben Gees, Mario Đanić and contributors
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
 *
 */

package com.appsamurai.storyly.ios;

import androidx.annotation.NonNull;

import com.appsamurai.storyly.ios.category.ActivitiesCategory;
import com.appsamurai.storyly.ios.category.AnimalsAndNatureCategory;
import com.appsamurai.storyly.ios.category.FlagsCategory;
import com.appsamurai.storyly.ios.category.FoodAndDrinkCategory;
import com.appsamurai.storyly.ios.category.ObjectsCategory;
import com.appsamurai.storyly.ios.category.SmileysAndPeopleCategory;
import com.appsamurai.storyly.ios.category.SymbolsCategory;
import com.appsamurai.storyly.ios.category.TravelAndPlacesCategory;
import com.appsamurai.storyly.emoji.EmojiProvider;
import com.appsamurai.storyly.emoji.emoji.EmojiCategory;

public final class IosEmojiProvider implements EmojiProvider {
  @Override @NonNull public EmojiCategory[] getCategories() {
    return new EmojiCategory[] {
      new SmileysAndPeopleCategory(),
      new AnimalsAndNatureCategory(),
      new FoodAndDrinkCategory(),
      new ActivitiesCategory(),
      new TravelAndPlacesCategory(),
      new ObjectsCategory(),
      new SymbolsCategory(),
      new FlagsCategory()
    };
  }
}
