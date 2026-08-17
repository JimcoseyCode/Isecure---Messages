.class Landroidx/datastore/preferences/protobuf/b0$c;
.super Landroidx/datastore/preferences/protobuf/b0$f;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/datastore/preferences/protobuf/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic h:Landroidx/datastore/preferences/protobuf/b0;


# direct methods
.method private constructor <init>(Landroidx/datastore/preferences/protobuf/b0;)V
    .locals 1

    .line 1
    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/b0$c;->h:Landroidx/datastore/preferences/protobuf/b0;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/datastore/preferences/protobuf/b0$f;-><init>(Landroidx/datastore/preferences/protobuf/b0;Landroidx/datastore/preferences/protobuf/b0$a;)V

    return-void
.end method

.method synthetic constructor <init>(Landroidx/datastore/preferences/protobuf/b0;Landroidx/datastore/preferences/protobuf/b0$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Landroidx/datastore/preferences/protobuf/b0$c;-><init>(Landroidx/datastore/preferences/protobuf/b0;)V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 3

    .line 1
    new-instance v0, Landroidx/datastore/preferences/protobuf/b0$b;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/b0$c;->h:Landroidx/datastore/preferences/protobuf/b0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Landroidx/datastore/preferences/protobuf/b0$b;-><init>(Landroidx/datastore/preferences/protobuf/b0;Landroidx/datastore/preferences/protobuf/b0$a;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method
