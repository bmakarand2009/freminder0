package freminder0

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        "/api/$controller/$id?"(){
            action = [GET:"show", PUT:"update", DELETE:"delete", POST:"save"]
            constraints {
                id matches: /^[a-zA-Z0-9]+$/
            }
        }
        "/"(controller: 'application', action:'index')
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
