.class public final LO/b$a;
.super Ljava/lang/Exception;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LO/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LO/b$a$a;
    }
.end annotation


# instance fields
.field private final g:LO/b$a$a;


# direct methods
.method constructor <init>(Ljava/lang/String;LO/b$a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LO/b$a;->g:LO/b$a$a;

    .line 5
    .line 6
    return-void
.end method
