allow_scm_jenkinsfile = false
pipeline_template = "Jenkinfile"
/*
  specify which libraries to load: 
    In the Governance Tier configuration file, 
    these should be configurations common across 
    all apps governed by this config. 
*/
libraries{
  merge = true 
  sonarqube
}

template_methods{
    unit_test
    static_code_analysis
    build
    xxx
}

stages{
    combo_stage {
        build
    }
}

keywords {
    version = "V1.00"
}

 
