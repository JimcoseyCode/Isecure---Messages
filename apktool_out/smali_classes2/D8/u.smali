.class final LD8/u;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:LC8/S;

.field private final b:LD8/u;


# direct methods
.method public constructor <init>(LC8/S;LD8/u;)V
    .locals 1

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LD8/u;->a:LC8/S;

    .line 10
    .line 11
    iput-object p2, p0, LD8/u;->b:LD8/u;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()LD8/u;
    .locals 1

    .line 1
    iget-object v0, p0, LD8/u;->b:LD8/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()LC8/S;
    .locals 1

    .line 1
    iget-object v0, p0, LD8/u;->a:LC8/S;

    .line 2
    .line 3
    return-object v0
.end method
