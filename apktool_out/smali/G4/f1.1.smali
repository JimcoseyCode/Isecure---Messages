.class abstract LG4/f1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field private static final a:Ljava/util/logging/Logger;

.field private static final b:LG4/E0;

.field public static final synthetic c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, LG4/f1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, LG4/f1;->a:Ljava/util/logging/Logger;

    .line 12
    .line 13
    new-instance v0, LG4/E0;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, v1}, LG4/E0;-><init>(LG4/d0;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, LG4/f1;->b:LG4/E0;

    .line 20
    .line 21
    return-void
.end method
