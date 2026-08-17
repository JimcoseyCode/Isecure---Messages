.class public final synthetic LF/T;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Ljava/util/List;

.field public final synthetic h:Landroidx/lifecycle/B;

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Landroidx/lifecycle/B;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LF/T;->g:Ljava/util/List;

    .line 5
    .line 6
    iput-object p2, p0, LF/T;->h:Landroidx/lifecycle/B;

    .line 7
    .line 8
    iput-object p3, p0, LF/T;->i:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, LF/T;->g:Ljava/util/List;

    .line 2
    .line 3
    iget-object v1, p0, LF/T;->h:Landroidx/lifecycle/B;

    .line 4
    .line 5
    iget-object v2, p0, LF/T;->i:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, LF/U;->b(Ljava/util/List;Landroidx/lifecycle/B;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
