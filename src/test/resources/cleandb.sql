delete from user;
delete from encounters;
delete from creatures;
insert into test_encounter_tracker.user values (1, 'jdhtest'), (2, 'secondtestname'), (3, 'testuserjdhthree');
insert into test_encounter_tracker.encounters values (1, 'test goblins', 1), (2, 'wizardenc', 2), (3, 'thirdencountertest', 1);
insert into test_encounter_tracker.creatures (id, creaturename, encounters_id, maxhitpoints, currenthitpoints) values (1, 'new test creature', 3, 50, 10);