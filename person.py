from datetime import datetime, date


class Person:
    """A Person with a name.
    Example: (doctest)
        >>> p = Person("Donald")
        >>> print(p)
        Donald
        >>> p.greet()
        GOOD MORNING Donald
    """
    def __init__(self, name: str, birthday: date = date.today()):
        """Initiaize a new Person object.

        :param name:
        :param birthday:
        """
        self.name = name
        self.birthday = birthday

    def __str__(self):
        return self.name

    def greet(self):
        """Greet the person ny name"""

        # if before 12:00 print "GOOD MORNING"
        now = datetime.now()
        if now.hour < 12:
            print("GOOD MORNING", self.name)
        # else print "GOOD AFTERNOON"
        else:
            print("GOOD AFTERNOON", self.name)

    def set_birthday(self, year: int, month: int, day: int):
        self.birthday = date(year, month, day)

    def age(self) -> int:
        """Return the person,s age in years."""

        now = date.today()
        age = now.year - self.birthday.year - 1
        if now.month < self.birthday.month:
            age += 1
        elif now.month == self.birthday.month:
            if now.day <= self.birthday.day:
                age += 1

        return age


me = Person('Sese')
me.greet()
me.set_birthday(2001, 1, 13)
print(me.age())
