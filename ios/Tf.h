
#ifdef RCT_NEW_ARCH_ENABLED
#import "RNTfSpec.h"

@interface Tf : NSObject <NativeTfSpec>
#else
#import <React/RCTBridgeModule.h>

@interface Tf : NSObject <RCTBridgeModule>
#endif

@end
