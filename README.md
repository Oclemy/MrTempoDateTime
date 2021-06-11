# MrTempoDateTime

Different DateTime functionalities e.g:
- Get current, past and future datetime
- Format and parse datetime
- Compare dates
- Add/SUbtract dates etc.

e.g

```kotlin

val now: Date = Tempo.now               //=> now
now + 1.week                            //=> next week
now - 2.days                            //=> day before yesterday
now + (3.weeks - 4.days + 5.hours)      //=> somewhere in 2 and a half weeks

Tempo.tomorrow                          //=> tomorrow
Tempo.yesterday                         //=> yesterday
1.day.ago                               //=> yesterday
3.weeks.ago                             //=> 3 weeks ago
5.years.forward                         //=> five years in the future

```

View more at [Camposha](https://camposha.info/android-examples/android-datetime-libraries/)
