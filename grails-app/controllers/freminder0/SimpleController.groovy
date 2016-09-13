package freminder0


import grails.rest.*
import grails.converters.*

class SimpleController {

    static mappings
//    def index() { }

    def show = {
        render "this is hellow orld" as JSON
    }

    def post = {
        render "this is a simpel pst rest" as JSON
    }

}
