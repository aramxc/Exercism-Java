class SpaceAge {

  //declare private method seconds
  private final double seconds;

  //declare maximum change allowed
  private static final double MAXIMUM_DELTA = 1E-02;

//public enum containing known oribital period values for each planet:
  public enum PlanetOrbital{
    EARTH(31557600),
    MERCURY(0.2408467),
    VENUS(0.61519726),
    MARS(1.8808158),
    JUPITER(11.862615),
    SATURN(29.447498),
    URANUS(84.016846),
    NEPTUNE(164.79132);

    private final double orbitalPeriod;   // in seconds

    // declare variable 'orbitalPeriod' in PlanetOrbital Method
    PlanetOrbital(double orbitalPeriod) {
        this.orbitalPeriod= orbitalPeriod;

  }

    private final double orbitalPeriod() {
      return this.orbitalPeriod;

    }

}

  // Declare variable seconds as input from user
    public SpaceAge(double seconds) {
      this.seconds = seconds;
    }

    double getSeconds() {
      return this.seconds;

    }

    //return age on Earth, in years
    double onEarth() {
      return (getSeconds() / (PlanetOrbital.EARTH.orbitalPeriod()));
    }

    //return age on Mercury, in years
    double onMercury() {
      return (getSeconds() / (PlanetOrbital.MERCURY.orbitalPeriod() * PlanetOrbital.EARTH.orbitalPeriod()));

    }

    //return age on Venus, in years
    double onVenus() {
      return (getSeconds() / (PlanetOrbital.VENUS.orbitalPeriod() * PlanetOrbital.EARTH.orbitalPeriod()));

    }

    //return age on Mercury, in years
    double onMars() {
      return (getSeconds() / (PlanetOrbital.MARS.orbitalPeriod() * PlanetOrbital.EARTH.orbitalPeriod()));

    }

    //return age on Jupiter, in years
    double onJupiter() {
return (getSeconds() / (PlanetOrbital.JUPITER.orbitalPeriod() * PlanetOrbital.EARTH.orbitalPeriod()));
    }

    //return age on Saturn, in years
    double onSaturn() {
return (getSeconds() / (PlanetOrbital.SATURN.orbitalPeriod() * PlanetOrbital.EARTH.orbitalPeriod()));
    }

    //return age on Uranus, in years
    double onUranus() {
return (getSeconds() / (PlanetOrbital.URANUS.orbitalPeriod() * PlanetOrbital.EARTH.orbitalPeriod()));
    }

    //return age on Neptune, in years
    double onNeptune() {
return (getSeconds() / (PlanetOrbital.NEPTUNE.orbitalPeriod() * PlanetOrbital.EARTH.orbitalPeriod()));
    }

}
