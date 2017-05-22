/*
 * flink-jpmml
 * Copyright (C) 2017 Radicalbit

 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.radicalbit.flink.pmml.scala.logging

import com.typesafe.scalalogging.slf4j.Logger
import org.slf4j.LoggerFactory

/** Guarantees lazy logging; it is necessary in order to provide the feature along
  * the code also if users employ `scala-2.10` scala version because `scala-logging` is
  * no more published.
  *
  */
trait LazyLogging {

  protected lazy val logger = {
    Logger(LoggerFactory.getLogger(getClass.getName))
  }
}