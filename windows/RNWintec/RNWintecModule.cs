using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Wintec.RNWintec
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNWintecModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNWintecModule"/>.
        /// </summary>
        internal RNWintecModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNWintec";
            }
        }
    }
}
