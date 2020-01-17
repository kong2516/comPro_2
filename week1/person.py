from datetime import datetime, date


class Person:
    """A Person with a name and a birthday.

    Example: (doctest)
        >>> p = Person("Donald")
        >>> print(p)
        Donald
        >>> p.greet()
        GOOD MORNING Donald
        >>> p.set_birthday(2001, 1, 13)
        >>> p.birthday
        2001-01-13
        >>> p.age()
        19

    """

    def __init__(self, name: str, birthday: date = date.today()):
        """Initiaize a new Person object.

        :param name:
        :param birthday:
        """

        self.__name = name
        self.birthday = birthday

    def __eq__(self, other):
        """Two person objects are equal if name and birthday are the same.
        """

        # 1.  verify that other is object from same class
        # if not isinstance(other, self.__class__):
        #     return False
        if other.__class__ == self.__class__:
            return True
        # 2.  compare self and other any way that make sense
        if self.name == other.name and self.birthday == other.birthday:
            return True
        else:
            return False

    def __str__(self):
        return self.__name

    @property                     
    def name(self):         
        return self.__name

    @name.setter
    def brand(self, name):         
        self.__name = name

    @property
    def first_initial(self):
        return self.__name[0]


    def greet(self):
        """Greet the person ny name"""

        # if before 12:00 print "GOOD MORNING"
        now = datetime.now()
        if now.hour < 12:
            print("GOOD MORNING,", self.__name)
        # else print "GOOD AFTERNOON"
        else:
            print("GOOD AFTERNOON,", self.__name)

    def set_birthday(self, year: int, month: int, day: int):
        self.birthday = date(year, month, day)

    def age(self) -> int:
        """Return the person,s age in years."""

        now = date.today()
        age = now.year - self.birthday.year - 1
        if now.month > self.birthday.month:
            age += 1
        elif now.month == self.birthday.month:
            if now.day >= self.birthday.day:
                age += 1
        return age