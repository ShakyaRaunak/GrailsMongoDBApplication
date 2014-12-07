package com.rkshakyaprojects.grailsmongodb

class PersonController {

    def index() {}

/*    private List<Person> importTeams(int page) {
        def rs = restClient.get("teams") // invoke web service
        List<Person> teams = rs.teams.collect {
            teamResponse ->
                Person team = new Person(teamname: teamResponse.teamname)
                team.save(); // Save is needed to dynamically add the attribute
                teamname.each { key, value ->
                    team["$key"] = value
                }
                teamname.save(); // We need the second save to ensure the variants get saved.
                return teamname
        }
        log.info("importTeams(),teams=teams")
        teams
    }*/
}
