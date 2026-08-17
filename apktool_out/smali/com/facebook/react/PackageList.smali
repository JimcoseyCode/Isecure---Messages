.class public Lcom/facebook/react/PackageList;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private application:Landroid/app/Application;

.field private mConfig:Lcom/facebook/react/shell/MainPackageConfig;

.field private reactNativeHost:Lcom/facebook/react/ReactNativeHost;


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lcom/facebook/react/PackageList;-><init>(Landroid/app/Application;Lcom/facebook/react/shell/MainPackageConfig;)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;Lcom/facebook/react/shell/MainPackageConfig;)V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/facebook/react/PackageList;->reactNativeHost:Lcom/facebook/react/ReactNativeHost;

    .line 8
    iput-object p1, p0, Lcom/facebook/react/PackageList;->application:Landroid/app/Application;

    .line 9
    iput-object p2, p0, Lcom/facebook/react/PackageList;->mConfig:Lcom/facebook/react/shell/MainPackageConfig;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/ReactNativeHost;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/facebook/react/PackageList;-><init>(Lcom/facebook/react/ReactNativeHost;Lcom/facebook/react/shell/MainPackageConfig;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/ReactNativeHost;Lcom/facebook/react/shell/MainPackageConfig;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/facebook/react/PackageList;->reactNativeHost:Lcom/facebook/react/ReactNativeHost;

    .line 5
    iput-object p2, p0, Lcom/facebook/react/PackageList;->mConfig:Lcom/facebook/react/shell/MainPackageConfig;

    return-void
.end method

.method private getApplication()Landroid/app/Application;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/PackageList;->reactNativeHost:Lcom/facebook/react/ReactNativeHost;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/react/PackageList;->application:Landroid/app/Application;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/react/ReactNativeHost;->getApplication()Landroid/app/Application;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method private getApplicationContext()Landroid/content/Context;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/PackageList;->getApplication()Landroid/app/Application;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method private getReactNativeHost()Lcom/facebook/react/ReactNativeHost;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/PackageList;->reactNativeHost:Lcom/facebook/react/ReactNativeHost;

    .line 2
    .line 3
    return-object v0
.end method

.method private getResources()Landroid/content/res/Resources;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/PackageList;->getApplication()Landroid/app/Application;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method


# virtual methods
.method public getPackages()Ljava/util/ArrayList;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/facebook/react/ReactPackage;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    new-instance v1, Lcom/facebook/react/shell/MainReactPackage;

    .line 4
    .line 5
    move-object/from16 v2, p0

    .line 6
    .line 7
    iget-object v3, v2, Lcom/facebook/react/PackageList;->mConfig:Lcom/facebook/react/shell/MainPackageConfig;

    .line 8
    .line 9
    invoke-direct {v1, v3}, Lcom/facebook/react/shell/MainReactPackage;-><init>(Lcom/facebook/react/shell/MainPackageConfig;)V

    .line 10
    .line 11
    .line 12
    new-instance v3, Lcom/reactnativecommunity/asyncstorage/i;

    .line 13
    .line 14
    invoke-direct {v3}, Lcom/reactnativecommunity/asyncstorage/i;-><init>()V

    .line 15
    .line 16
    .line 17
    new-instance v4, Lexpo/modules/ExpoModulesPackage;

    .line 18
    .line 19
    invoke-direct {v4}, Lexpo/modules/ExpoModulesPackage;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance v5, LZ6/i;

    .line 23
    .line 24
    invoke-direct {v5}, LZ6/i;-><init>()V

    .line 25
    .line 26
    .line 27
    new-instance v6, LI6/e;

    .line 28
    .line 29
    invoke-direct {v6}, LI6/e;-><init>()V

    .line 30
    .line 31
    .line 32
    new-instance v7, LA9/a;

    .line 33
    .line 34
    invoke-direct {v7}, LA9/a;-><init>()V

    .line 35
    .line 36
    .line 37
    new-instance v8, Lcom/reactnativekeyboardcontroller/b;

    .line 38
    .line 39
    invoke-direct {v8}, Lcom/reactnativekeyboardcontroller/b;-><init>()V

    .line 40
    .line 41
    .line 42
    new-instance v9, Ln6/c;

    .line 43
    .line 44
    invoke-direct {v9}, Ln6/c;-><init>()V

    .line 45
    .line 46
    .line 47
    new-instance v10, Lcom/reactnativepagerview/c;

    .line 48
    .line 49
    invoke-direct {v10}, Lcom/reactnativepagerview/c;-><init>()V

    .line 50
    .line 51
    .line 52
    new-instance v11, LF6/a;

    .line 53
    .line 54
    invoke-direct {v11}, LF6/a;-><init>()V

    .line 55
    .line 56
    .line 57
    new-instance v12, Lo6/b;

    .line 58
    .line 59
    invoke-direct {v12}, Lo6/b;-><init>()V

    .line 60
    .line 61
    .line 62
    new-instance v13, Lcom/swmansion/reanimated/ReanimatedPackage;

    .line 63
    .line 64
    invoke-direct {v13}, Lcom/swmansion/reanimated/ReanimatedPackage;-><init>()V

    .line 65
    .line 66
    .line 67
    new-instance v14, LG6/c;

    .line 68
    .line 69
    invoke-direct {v14}, LG6/c;-><init>()V

    .line 70
    .line 71
    .line 72
    new-instance v15, Lcom/th3rdwave/safeareacontext/e;

    .line 73
    .line 74
    invoke-direct {v15}, Lcom/th3rdwave/safeareacontext/e;-><init>()V

    .line 75
    .line 76
    .line 77
    new-instance v16, Lcom/swmansion/rnscreens/t;

    .line 78
    .line 79
    invoke-direct/range {v16 .. v16}, Lcom/swmansion/rnscreens/t;-><init>()V

    .line 80
    .line 81
    .line 82
    new-instance v17, Lcom/horcrux/svg/SvgPackage;

    .line 83
    .line 84
    invoke-direct/range {v17 .. v17}, Lcom/horcrux/svg/SvgPackage;-><init>()V

    .line 85
    .line 86
    .line 87
    new-instance v18, Lcom/swmansion/worklets/WorkletsPackage;

    .line 88
    .line 89
    invoke-direct/range {v18 .. v18}, Lcom/swmansion/worklets/WorkletsPackage;-><init>()V

    .line 90
    .line 91
    .line 92
    move-object/from16 v19, v1

    .line 93
    .line 94
    const/16 v1, 0x11

    .line 95
    .line 96
    new-array v1, v1, [Lcom/facebook/react/ReactPackage;

    .line 97
    .line 98
    const/16 v20, 0x0

    .line 99
    .line 100
    aput-object v19, v1, v20

    .line 101
    .line 102
    const/16 v19, 0x1

    .line 103
    .line 104
    aput-object v3, v1, v19

    .line 105
    .line 106
    const/4 v3, 0x2

    .line 107
    aput-object v4, v1, v3

    .line 108
    .line 109
    const/4 v3, 0x3

    .line 110
    aput-object v5, v1, v3

    .line 111
    .line 112
    const/4 v3, 0x4

    .line 113
    aput-object v6, v1, v3

    .line 114
    .line 115
    const/4 v3, 0x5

    .line 116
    aput-object v7, v1, v3

    .line 117
    .line 118
    const/4 v3, 0x6

    .line 119
    aput-object v8, v1, v3

    .line 120
    .line 121
    const/4 v3, 0x7

    .line 122
    aput-object v9, v1, v3

    .line 123
    .line 124
    const/16 v3, 0x8

    .line 125
    .line 126
    aput-object v10, v1, v3

    .line 127
    .line 128
    const/16 v3, 0x9

    .line 129
    .line 130
    aput-object v11, v1, v3

    .line 131
    .line 132
    const/16 v3, 0xa

    .line 133
    .line 134
    aput-object v12, v1, v3

    .line 135
    .line 136
    const/16 v3, 0xb

    .line 137
    .line 138
    aput-object v13, v1, v3

    .line 139
    .line 140
    const/16 v3, 0xc

    .line 141
    .line 142
    aput-object v14, v1, v3

    .line 143
    .line 144
    const/16 v3, 0xd

    .line 145
    .line 146
    aput-object v15, v1, v3

    .line 147
    .line 148
    const/16 v3, 0xe

    .line 149
    .line 150
    aput-object v16, v1, v3

    .line 151
    .line 152
    const/16 v3, 0xf

    .line 153
    .line 154
    aput-object v17, v1, v3

    .line 155
    .line 156
    const/16 v3, 0x10

    .line 157
    .line 158
    aput-object v18, v1, v3

    .line 159
    .line 160
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 165
    .line 166
    .line 167
    return-object v0
.end method
