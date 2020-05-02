skip_default_checkout = true

/*
  specify which libraries to load: 
    In the Governance Tier configuration file, 
    these should be configurations common across 
    all apps governed by this config. 
*/
libraries{
  merge = true 
  sonarqube
  github_enterprise
}


application_environments{
  dev{} 
}

steps{
  step_from_config{
    image = "maven"
    command = "mvn -v"
  }
  unit_test
}

template_methods{
  passthrough
}
