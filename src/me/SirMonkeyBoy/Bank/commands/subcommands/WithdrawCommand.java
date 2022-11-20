package me.SirMonkeyBoy.Bank.commands.subcommands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import me.SirMonkeyBoy.Bank.Main;
import me.SirMonkeyBoy.Bank.commands.SubCommand;

public class WithdrawCommand extends SubCommand{
	
	private Main bank;
	
    public WithdrawCommand(Main bank) {
         this.bank = bank;
    }
	
	public String getName() {
	return "depsoit";
	
	}
	
	public String getDescription() {
		return "Deposits Money";
		
	}
	
	public String getSyntax() {
		return "/bank deposit";
		
	}
	
	public void perform(Player player, String args[]) {


	if (args.length > 0) {
	// /bank withdraw
	if (player.hasPermission("bank.withdraw")) {
		player.sendMessage(ChatColor.translateAlternateColorCodes('&', bank.getConfig().getString("withdraw-message")));
		}
	else {
		if (!player.hasPermission("bank.withdraw")) {
			player.sendMessage(ChatColor.RED + "You can't run this command");
		}
	}
	}
	}
}