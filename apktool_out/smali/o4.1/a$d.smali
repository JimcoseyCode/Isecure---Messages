.class public interface abstract Lo4/a$d;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo4/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo4/a$d$a;
    }
.end annotation


# static fields
.field public static final f:Lo4/a$d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lo4/a$d$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lo4/a$d$a;-><init>(Lo4/j;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lo4/a$d;->f:Lo4/a$d$a;

    .line 8
    .line 9
    return-void
.end method
