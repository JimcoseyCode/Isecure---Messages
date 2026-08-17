.class public final synthetic Lg0/A;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Lg0/I;

.field public final synthetic h:J


# direct methods
.method public synthetic constructor <init>(Lg0/I;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg0/A;->g:Lg0/I;

    .line 5
    .line 6
    iput-wide p2, p0, Lg0/A;->h:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lg0/A;->g:Lg0/I;

    .line 2
    .line 3
    iget-wide v1, p0, Lg0/A;->h:J

    .line 4
    .line 5
    invoke-static {v0, v1, v2}, Lg0/I;->m(Lg0/I;J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
