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

package com.aionemu.gameserver.questEngine.handlers.models;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

import com.aionemu.gameserver.questEngine.QuestEngine;
import com.aionemu.gameserver.questEngine.handlers.template.RelicRewards;

/**
 * @author Bobobear
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelicRewardsData")
public class RelicRewardsData extends XMLQuest {

	@XmlAttribute(name = "start_npc_ids", required = true)
	protected List<Integer> startNpcIds;
	@XmlAttribute(name = "relic_var1")
	protected int relicVar1;
	@XmlAttribute(name = "relic_var2")
	protected int relicVar2;
	@XmlAttribute(name = "relic_var3")
	protected int relicVar3;
	@XmlAttribute(name = "relic_var4")
	protected int relicVar4;
	@XmlAttribute(name = "relic_count")
	protected int relicCount;

	@Override
	public void register(QuestEngine questEngine) {
		RelicRewards template = new RelicRewards(id, startNpcIds, relicVar1, relicVar2, relicVar3, relicVar4, relicCount);
		questEngine.addQuestHandler(template);
	}
}
