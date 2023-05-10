import React, { Component } from 'react';
import AotService from '../service/AotService';

class AotComponent extends Component {

    constructor(props) {
        super(props);
        
        this.state = {
            aotDto: {},
            militaryDto: {},
            titanDto: {}
        }
    }

    componentDidMount(){
        AotService.getAot().then((response) => {
            this.setState({aotDto : response.data.aotDto})
            this.setState({militaryDto : response.data.militaryDto})
            this.setState({titanDto : response.data.titanDto})

            console.log(this.state.aotDto)
            console.log(this.state.militaryDto)
            console.log(this.state.titanDto)
        })
    }
    
    render() {
        return (
            <div> <br/><br/>
                <div className='card col-md-6 offset-md-3'>
                    <h3 className='text-center card-header'> People Details </h3>
                    <div className='card-body'>
                        <div className='row'>
                            <p><strong>First Name: </strong> {this.state.aotDto.firstName}</p>
                        </div>
                        <div className='row'>
                            <p><strong>Last Name: </strong> {this.state.aotDto.lastName}</p>
                        </div>
                    </div> <br/><br/>
                    <h3 className='text-center card-header'> Military Details </h3>
                    <div className='card-body'>
                        <div className='row'>
                            <p><strong>Military Name: </strong> {this.state.militaryDto.militaryName}</p>
                        </div>
                        <div className='row'>
                            <p><strong>Military Description: </strong> {this.state.militaryDto.militaryDescription}</p>
                        </div>
                        <div className='row'>
                            <p><strong>Military Code: </strong> {this.state.militaryDto.militaryCode}</p>
                        </div>
                    </div> <br/><br/>
                    <h3 className='text-center card-header'> Titan Details </h3>
                    <div className='card-body'>
                        <div className='row'>
                            <p><strong>Titan Name: </strong> {this.state.titanDto.titanName}</p>
                        </div>
                        <div className='row'>
                            <p><strong>Titan Description: </strong> {this.state.titanDto.titanDescription}</p>
                        </div>
                        <div className='row'>
                            <p><strong>Inheritor: </strong> {this.state.titanDto.inheritor}</p>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

export default AotComponent;