.class public final LH2/l;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH2/l$a;
    }
.end annotation


# instance fields
.field private final a:Lg2/a;

.field private final b:LH2/l$a;


# direct methods
.method public constructor <init>(Lg2/a;LH2/l$a;)V
    .locals 1

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LH2/l;->a:Lg2/a;

    .line 10
    .line 11
    iput-object p2, p0, LH2/l;->b:LH2/l$a;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()Lg2/a;
    .locals 1

    .line 1
    iget-object v0, p0, LH2/l;->a:Lg2/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()LH2/l$a;
    .locals 1

    .line 1
    iget-object v0, p0, LH2/l;->b:LH2/l$a;

    .line 2
    .line 3
    return-object v0
.end method
