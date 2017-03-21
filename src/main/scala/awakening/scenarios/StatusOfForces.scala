
// Labyrinth Awakening
//
// An scala implementation of the solo AI for the game 
// Labyrinth: The Awakening, 2010 - ?, designed by Trevor Bender and
// published by GMT Games.
// 
// Copyright (c) 2017 Curt Sellmer
//
// Permission is hereby granted, free of charge, to any person obtaining
// a copy of this software and associated documentation files (the
// "Software"), to deal in the Software without restriction, including
// without limitation the rights to use, copy, modify, merge, publish,
// distribute, sublicense, and/or sell copies of the Software, and to
// permit persons to whom the Software is furnished to do so, subject to
// the following conditions:
//
// The above copyright notice and this permission notice shall be
// included in all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
// EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
// MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
// NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
// LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
// OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
// WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

package awakening.scenarios

import awakening.LabyrinthAwakening._

class StatusOfForces extends Scenario {
  val name           = "Status of Force Agreement"
  val expansion      = true
  val prestige       = 6
  val usPosture      = Soft
  val funding        = 6
  val availablePlots = Plot1::Plot1::Plot1::Plot2::Plot2::Plot3::Nil
  val countries = List(
    DefaultIraq.copy(governance = Poor, alignment = Neutral, militia = 1, activeCells = 2,
                     awakening = 1, reaction = 1),
    DefaultGulfStates.copy(governance = Fair, alignment = Ally, troops = 2, awakening = 1),
    DefaultAfghanistan.copy(governance = Poor, alignment = Ally, troops = 6, sleeperCells = 2,
                            regimeChange = TanRegimeChange),
    DefaultPakistan.copy(governance = Poor, alignment = Neutral, sleeperCells = 1, reaction = 1),
    DefaultSyria.copy(governance = Poor, alignment = Neutral, sleeperCells = 4,
                      awakening = 1, reaction = 1),
    DefaultEgypt.copy(governance = Fair, alignment = Neutral, awakening = 1, reaction = 1),
    DefaultUnitedKingdom.copy(posture = Hard),
    DefaultFrance.copy(posture = Hard),
    DefaultBenelux.copy(posture = Soft))
  val markersInPlay = List.empty[String]
  val cardsRemoved = 133::185::237::Nil
  val offMapTroops = 0
}
