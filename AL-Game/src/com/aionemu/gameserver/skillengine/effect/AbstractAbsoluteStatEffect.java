/**
 * This file is part of Aion-Lightning <aion-lightning.org>.
 *
 *  Aion-Lightning is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Aion-Lightning is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details. *
 *  You should have received a copy of the GNU General Public License
 *  along with Aion-Lightning.
 *  If not, see <http://www.gnu.org/licenses/>.
 */

package com.aionemu.gameserver.skillengine.effect;

import javax.xml.bind.annotation.*;

import com.aionemu.gameserver.dataholders.DataManager;
import com.aionemu.gameserver.model.templates.stats.ModifiersTemplate;

/**
 * @author Rolandas
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractAbsoluteStatEffect")
public abstract class AbstractAbsoluteStatEffect extends EffectTemplate {

	@XmlAttribute(name = "statsetid")
	private int statSetId;

	/**
	 * @return the statSetId
	 */
	public ModifiersTemplate getModifiersSet() {
		return DataManager.ABSOLUTE_STATS_DATA.getTemplate(statSetId);
	}
}
