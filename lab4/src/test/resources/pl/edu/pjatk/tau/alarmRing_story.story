Scenario:  alarm for 10:00 should ring

Given there is the time 10:00 to ring
When 10:00 is set to Alarm Ring
Then Alarm should ring at 10:00

Examples:
|time|set|result|
|10:00|10:00|10:00|
