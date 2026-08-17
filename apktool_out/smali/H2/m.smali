.class final LH2/m;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:LH2/j;

.field private final b:Ljava/util/Date;


# direct methods
.method public constructor <init>(LH2/j;Ljava/util/Date;)V
    .locals 1

    .line 1
    const-string v0, "frameLoader"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "insertedTime"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LH2/m;->a:LH2/j;

    .line 15
    .line 16
    iput-object p2, p0, LH2/m;->b:Ljava/util/Date;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()LH2/j;
    .locals 1

    .line 1
    iget-object v0, p0, LH2/m;->a:LH2/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Ljava/util/Date;
    .locals 1

    .line 1
    iget-object v0, p0, LH2/m;->b:Ljava/util/Date;

    .line 2
    .line 3
    return-object v0
.end method
