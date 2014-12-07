import com.rkshakyaprojects.grailsmongodb.Person
import grails.util.Environment

class BootStrap {

    def init = { servletContext ->
        switch (Environment.current) {
            case Environment.DEVELOPMENT:
                loadDevelopmentData()
            }
    }

    def destroy = {
    }

    def loadDevelopmentData() {
        new Person(firstName: 'Raunak', lastName: 'Shakya').save(flush: true)
        new Person(firstName: 'Ricky', lastName: 'Shakya').save(flush: true)
    }
}
