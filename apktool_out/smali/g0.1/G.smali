.class public final synthetic Lg0/G;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Lg0/I;

.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lg0/I;Ljava/util/List;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg0/G;->g:Lg0/I;

    .line 5
    .line 6
    iput-object p2, p0, Lg0/G;->h:Ljava/util/List;

    .line 7
    .line 8
    iput-object p3, p0, Lg0/G;->i:Ljava/lang/Runnable;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lg0/G;->g:Lg0/I;

    .line 2
    .line 3
    iget-object v1, p0, Lg0/G;->h:Ljava/util/List;

    .line 4
    .line 5
    iget-object v2, p0, Lg0/G;->i:Ljava/lang/Runnable;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lg0/I;->x(Lg0/I;Ljava/util/List;Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
