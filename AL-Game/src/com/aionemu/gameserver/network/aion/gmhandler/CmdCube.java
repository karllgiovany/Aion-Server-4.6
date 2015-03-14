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

package com.aionemu.gameserver.network.aion.gmhandler;

import com.aionemu.gameserver.model.gameobjects.player.Player;
import com.aionemu.gameserver.utils.PacketSendUtility;
import com.aionemu.gameserver.services.CubeExpandService;

/**
 * @author Waii
 */
public final class CmdCube extends AbstractGMHandler {

	public CmdCube(Player admin, String params) {
		super(admin, params);
		run();
	}

	public void run() {
		@SuppressWarnings("unused")
		Player t = target != null ? target : admin;

		CubeExpandService.expand(target, true);
		PacketSendUtility.sendMessage(admin, "9 cube slots successfully added");
	}
}
