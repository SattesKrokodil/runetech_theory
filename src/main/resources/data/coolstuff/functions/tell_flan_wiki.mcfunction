tellraw @p ["",{"text":"Congratulations on your new claim!","color":"gold"},{"text":" "},{"text":" >> Flan - Wiki << ","color":"green","clickEvent":{"action":"open_url","value":"https://github.com/Flemmli97/Flan/wiki"}}]
execute as @p run flan transferClaim @p
particle minecraft:glow ~ ~ ~ 0.1 0.1 0.1 0.1 20 normal
particle minecraft:firework ~ ~ ~ 0.1 1 0.1 0.1 10 normal
playsound minecraft:ui.toast.challenge_complete player @p ~ ~ ~ 100 1.5
