# Kingdom Bank

Kingdom Bank is a Plugin made for the Minecraft server software PaperMC

Commands:
- `/bank` Displays a list of subcommands.
  - `/bank help` Displays a list of subcommands.
  - `/bank balance` Shows your bank balance.
  - `/bank deposit Amount` Deposits to your bank.
  - `/bank withdraw Amount` Withdraws from your bank.
- `/banktop` Displays the top 10 bank balances.
- `/aback` Displays a list of subcommands.
  - `/abank reload` Reloads the config file.
  - `/abank balother Name` Gives you the bank balance of another player.

Features:
- Stores all balances in a database
- Keeps a record of all Transactions
- It supports MariaDB
- Supports Cooldown timer for all commands that use the database

Dependency's:
- [Vault](https://www.spigotmc.org/resources/vault.34315/) Required
- The recommend economy plugin is [EssentialsX](https://essentialsx.net/downloads.html) not tested with others

I made this Project for fun as I wanted a Bank plugin that stores its data in a database and also tracks the deposit and withdraws from it.


