import axios from 'axios'

const AOT_SERVICE_BASE_URL = "http://localhost:9191/aot/getAot";
const AOT_SERVICE_ID = 5;

class AotService{
    getAot(){
       return axios.get(AOT_SERVICE_BASE_URL + "/" + AOT_SERVICE_ID);
    }
}

export default new AotService