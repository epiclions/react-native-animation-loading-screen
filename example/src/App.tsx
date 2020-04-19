import React from 'react'
import { View, StyleSheet } from 'react-native'
import {
  AnimationLoadingScreen
} from 'react-native-animation-loading-screen'

const styles = StyleSheet.create({
  container: {
    width: '100%',
    height: '100%',
    flexWrap: 'wrap'
  },
  component: {
    width: 100,
    height: 100,
    margin: 5
  }
})

class App extends React.Component<{}> {

  render() {
    return (
      <View style={styles.container}>
        <AnimationLoadingScreen
          style={styles.component}
          color={'#910b16'}
        />
      </View>
    )
  }
}

export default App
