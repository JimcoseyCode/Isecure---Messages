.class public final synthetic LI4/y9;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LP4/g;


# instance fields
.field public final synthetic a:LI4/z9;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(LI4/z9;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LI4/y9;->a:LI4/z9;

    .line 5
    .line 6
    iput-wide p2, p0, LI4/y9;->b:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 3

    .line 1
    iget-object v0, p0, LI4/y9;->a:LI4/z9;

    .line 2
    .line 3
    iget-wide v1, p0, LI4/y9;->b:J

    .line 4
    .line 5
    invoke-virtual {v0, v1, v2, p1}, LI4/z9;->b(JLjava/lang/Exception;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
